import java.io.IOException;

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

    public Integer countUrinals(String input_str) {


        boolean isStringGood = goodString(input_str);
        if(!isStringGood)
            return -1;

        int total=0;
        String[] s=input_str.split("");
        int size=s.length;

        int input_array[]=new int[size];

        int index_1=0;
        while(index_1<size)
        {
            input_array[index_1]=Integer.parseInt(String.valueOf(s[index_1]));
            index_1++;
        }

        if(size==1){
            if(input_array[0]==0){
                total=1;
                input_array[0]=1;
            }
        }


        else {
            int index_2=0;
            if(input_array[index_2]==0 && input_array[index_2+1]!=1){
                input_array[index_2]=1;
                total++;
            }


        for(index_2=1;index_2<size-1;index_2++){
            if(input_array[index_2]==0 && input_array[index_2-1]!=1 && input_array[index_2+1]!=1){
                input_array[index_2]=1;
                total++;
            }
        }
        if(input_array[index_2]==0&&input_array[index_2-1]!=1) {
            total++;
            input_array[index_2] = 1;
        }
    }
        return total;

   }
}
