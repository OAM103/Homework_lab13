
public class PhoneNumber {
    private String code, A, B, C;

    public PhoneNumber(String phone){

        code = phone.substring(0, phone.length()-10);
        A = phone.substring(phone.length()-10, phone.length()-7);
        B = phone.substring(phone.length()-7, phone.length()-4);
        C = phone.substring(phone.length()-4);
    }

    public String toString() {
        return code + A + "-" + B + "-" + C;
    }


}
