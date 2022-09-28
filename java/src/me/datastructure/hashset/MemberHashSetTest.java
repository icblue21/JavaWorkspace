package me.datastructure.hashset;

public class MemberHashSetTest {

    public static void main(String[] args){

        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001, "김유신");
        Member member2 = new Member(1002, "아무개");
        Member member3 = new Member(1003, "홍길동");
        Member member4 = new Member(1004, "너구리");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);

        memberHashSet.showAllMember();
        memberHashSet.removeMember(1001);
        memberHashSet.showAllMember();
    }
}
