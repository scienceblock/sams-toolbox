package app.sambennett.toolbox;

public class GetDetails {
    public static String get(){
        String details = "";
        details += "Logged in user: " + System.getProperty("user.name");
        details += "\nOs Name:" + System.getProperty("os.name");
        details += "\nOs Version: " + System.getProperty("os.version");
        return details;
    }
}
