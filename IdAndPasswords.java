import java.util.HashMap;

public class IdAndPasswords {

//    hash map
    HashMap<String,String> logininfo = new HashMap<>();

    IdAndPasswords(){
        logininfo.put("Trizah","Chichi");
        logininfo.put("Daisy", "YSIAD");
        logininfo.put("Ian", "UGETRRIT");
        logininfo.put("Euphy", "12345678");
    }
    public HashMap<String, String> getLoginInfo(){
        return  logininfo;
    }

}
