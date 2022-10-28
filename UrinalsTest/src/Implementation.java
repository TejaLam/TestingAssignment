import java.util.Scanner;

public class Implementation
{
    public String getString()
    {
        return null;
    }

    public Boolean goodString(String str_input) {
        for(int index=0;index<str_input.length();index++)
        {
            if(str_input.length() > index+1)
            {
                if(str_input.charAt(index+1)=='1' && str_input.charAt(index)=='1') {
                    return false;
                }
            }
            if(str_input.charAt(index)!='1' && str_input.charAt(index)!='0')
            {
                return false;
            }
        }
        return true;
    }

    public void openFile() {
    }

    public Integer countUrinals(String str) {
        return 0;
    }
}
