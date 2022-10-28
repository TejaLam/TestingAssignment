import java.io.*;
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

    public Integer openFile(String path) {
            try{
                File file_name=new File(path);
                if(file_name==null)
                    throw new IOException();


                File count_file=new File("src/counter.txt");
                if(count_file==null)
                    throw new IOException();
                Scanner c=new Scanner(count_file);
                int counter=Integer.parseInt(c.nextLine());


                String output_file="src/rule.txt";
                if(counter!=0)
                    output_file="src/rule"+counter+".txt";


                Scanner sc=new Scanner(file_name);
                while(sc.hasNextLine()){
                    String s=sc.nextLine();
                    if(s.equals("-1"))
                        break;
                    int spaces=countUrinals(s);
                    writeToFile(output_file,spaces);

                }


                FileWriter counter_writer=new FileWriter("src/counter.txt");
                if(counter_writer==null)
                    throw new IOException();
                counter_writer.write(Integer.toString(counter+1));
                counter_writer.close();

                System.out.println("Now we have Successfully written output to "+output_file);
                return 1;
            }
            catch(IOException e)
            {
                System.out.println("Not able Error in opening file");
                e.printStackTrace();
                return 0;
            }

        }

    public Integer writeToFile(String outputfile,int spaces){
        try {
            FileWriter fileWriter = new FileWriter(outputfile, true);
            if(fileWriter==null)
                throw new IOException();
            BufferedWriter buffw=new BufferedWriter(fileWriter);
            if(buffw==null)
                throw new IOException();

            buffw.write(Integer.toString(spaces));
            buffw.newLine();
            buffw.close();
            return 1;
        }
        catch(IOException e){
            System.out.println("not able to open output file");
            e.printStackTrace();
            return 0;
        }


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
