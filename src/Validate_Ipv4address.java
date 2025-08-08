import java.util.regex.Pattern;

public class Validate_Ipv4address {
    public static void address(String addrs){

      if (Pattern.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$",addrs))
      {
            System.out.println("Valid Adrress");
        }
        else{
            System.out.println("Invalid Address");
        }
    }
    public static void main(String[] args) {
        address("144.23.25.122");
    }
}
