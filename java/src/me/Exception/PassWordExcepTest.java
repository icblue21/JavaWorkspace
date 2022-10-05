package me.Exception;

public class PassWordExcepTest {

    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password) throws PassWordException{

        if(password == null){
            throw new PassWordException("비밀번호는 null일 수 없습니다.");
        } else if ( password.length() < 5 ){
            throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
        } else if ( password.matches("[a-zA-z]+")){
            throw new PassWordException("비밀번호는 숫자나 특수문자를 반드시 포함해야 합니다.");
        }

        this.password = password;
    }

    public static void main(String[] args){

        PassWordExcepTest test = new PassWordExcepTest();

        String newPassword = null;

        try {
            test.setPassword(newPassword);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        newPassword = "abcsdf";

        try {
            test.setPassword(newPassword);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        newPassword = "ab12";

        try {
            test.setPassword(newPassword);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        newPassword = "재학짱123";

        try {
            test.setPassword(newPassword);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }
    }
}
