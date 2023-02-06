package Data_Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayList_Quiz1 {
    public static final String RESTART_MENU = "메뉴를 다시 선택해주세요.\n";	// 메뉴 선택 메세지 출력. final 수정 X.
    private static final Scanner sc = new Scanner(System.in);	// Scanner 객체 생성.	System.in은 사용자로부터 키 입력을 받는다.

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();	// ArrayList --> List, 업캐스팅
        String menu;
        do {
            printMenu();
            System.out.print("\n메뉴 선택 => ");
            menu = sc.next();
            if (menu.equals("1")) {
                inputData(members);
                continue;
            }
            if (menu.equals("2")) {
                printMembers(members);
                continue;
            }
            if (menu.equals("3")) {
                printMember(members);
                continue;
            }
            if (menu.equals("4")) {
                modify(members);
                continue;
            }
            if (menu.equals("5")) {
                removeMember(members);
                continue;
            }
            if (menu.equals("6")) {
                System.out.println("\n프로그램 종료...");
                break;
            }
            System.out.println("\n메뉴를 다시 입력하세요.");
        } while (true);
//        Sample
//        Member member = new Member();
//        member.setId("A001");
//        member.setDivision("기술부");
//        member.setName("김정욱");
//        member.setGender("남성");
//        member.setEmail("workju1124@gmail.com");
//        System.out.println(isNotEmailFormat(member.getEmail()));
//        members.add(member);
//        printMembers(members);
    }

    /******************** PRINT ********************/
    private static void printMenu() {
        System.out.println("\n  *** 메뉴 ***");
        System.out.println("1. 사원정보 입력");
        System.out.println("2. 사원정보 출력");
        System.out.println("3. 사원정보 검색");
        System.out.println("4. 사원정보 수정");
        System.out.println("5. 사원정보 삭제");
        System.out.println("6. 프로그램 종료");
    }

    /******************** INPUT ********************/
    private static void inputData(List<Member> members) {
        Member member = getMember();
        if (isNotEmailFormat(member.getEmail())) {
            System.out.println("\n해당 사원의 이메일형식이 올바르지 않습니다.");
            System.out.println("입력한 이메일 : " + member.getEmail());
            System.out.println(RESTART_MENU);
            return;
        }
        if (isDuplicationId(members, member)) {
            System.out.println("해당 사원번호를 가진 사원이 존재합니다.");
            printTopBar();
            System.out.println(findByDuplicationMember(members, member));
            printBar();
            System.out.println(RESTART_MENU);
            return;
        }
        members.add(member);
    }

    /******************** OUTPUT ********************/
    private static void printBar() {
        System.out.println("====================================================================");
    }

    private static void printTopBar() {
        // TODO 정보 출력
        System.out.println("\n사원번호   부서명     이름       성별      이메일");
        printBar();
    }

    private static void printMembers(List<Member> members) {
        if (members.isEmpty()) {
            System.out.println("\n사원이 한명도 존재하지 않습니다.");
            return;
        }
        printTopBar();
        for (Member member : members) {
            System.out.println(member);
        }
        printBar();
    }

    private static void printMember(List<Member> members) {
        Member findMember = findByMemberId(members, "검색");
        if (findMember == null) {
            System.out.println("사원번호를 가진 사원은 존재하지 않습니다.");
            System.out.println(RESTART_MENU);
            return;
        }
        printTopBar();
        System.out.println(findMember);
        printBar();
    }

    /******************** SEARCH ********************/
    private static Member findByDuplicationMember(List<Member> members, Member duplicationMember) {
        for (Member member : members) {
            if (member.getId().equals(duplicationMember.getId())) {
                return member;
            }
        }
        return null;
    }

    private static Member findByMemberId(List<Member> members, String type) {
        System.out.print("\n" + type + "하실 사원번호를 입력해주세요 : ");
        String id = sc.next();
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        System.out.println("해당 사원번호를 가진 사원은 존재하지 않습니다.");
        System.out.println(RESTART_MENU);
        return null;
    }

    /******************** MODIFY ********************/
    private static void modify(List<Member> members) {
        Member findMember = findByMemberId(members, "수정");
        if (findMember == null) {
            return;
        }
        int findMemberIndex = members.indexOf(findMember);
        Member newMember = getMember();
        members.set(findMemberIndex, newMember);
        printTopBar();
        System.out.println(findMember + " 수정전");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(newMember + " 수정후");
        printBar();
    }

    /******************** REMOVE ********************/
    private static void removeMember(List<Member> members) {
        Member findMember = findByMemberId(members, "삭제");
        if (findMember == null) {
            return;
        }
        members.remove(findMember);
        System.out.println("사원번호 : [" + findMember.getId() + "], 이름 : [" + findMember.getName() + "] 사원을 삭제하였습니다.");
    }

    /******************** VALID ********************/
    private static boolean isDuplicationId(List<Member> members, Member findMember) {
        for (Member member : members) {
            if (member.getId().equals(findMember.getId())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotEmailFormat(String email) {
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return !m.matches();
    }

    /******************** ETC ********************/
    private static Member getMember() {
        Member member = new Member();
        System.out.print("\n사원번호를 입력해주세요 : ");
        member.setId(sc.next());
        System.out.print("부서명을 입력해주세요 : ");
        member.setDivision(sc.next());
        System.out.print("이름을 입력해주세요 : ");
        member.setName(sc.next());
        System.out.print("성별을 입력해주세요 : ");
        member.setGender(sc.next());
        System.out.print("이메일을 입력해주세요 : ");
        member.setEmail(sc.next());
        return member;
    }

    static class Member {
        private String id;
        private String division;
        private String name;
        private String gender;
        private String email;

        public Member() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%-5s      %-5s   %-5s   %-5s   %-25s", id, division, name, gender, email);
        }
    }
}
