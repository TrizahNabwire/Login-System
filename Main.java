public class Main {
    public static void main(String[] args){
        IdAndPasswords idandPasswords = new IdAndPasswords();

        Login login = new Login(idandPasswords.getLoginInfo());

    }
}
