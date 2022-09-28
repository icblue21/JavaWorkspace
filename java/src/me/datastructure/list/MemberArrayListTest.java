package me.datastructure.list;

public class MemberArrayListTest {

    public static void main(String[] args){

        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "김유신");
        Member member2 = new Member(1002, "아무개");
        Member member3 = new Member(1003, "홍길동");
        Member member4 = new Member(1004, "너구리");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(1001);
        memberArrayList.showAllMember();
    }
}
