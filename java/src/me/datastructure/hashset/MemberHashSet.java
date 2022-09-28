package me.datastructure.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size){
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberID){

        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){

            Member member = ir.next();

            int tempId = member.getMemberId();

            if( tempId == memberID ){
                hashSet.remove(member);
                return true;
            }
        }

        /* for(int i=0; i<hashSet.size(); i++){
            Member member = hashSet.get(i);

            int tempId = member.getMemberId();
            if( tempId == memberID ){
                hashSet.remove(i);
                return true;
            }
        }*/
        System.out.println(memberID+"가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){

        for( Member member : hashSet ){
            System.out.println(member);
        }
        System.out.println();
    }
}
