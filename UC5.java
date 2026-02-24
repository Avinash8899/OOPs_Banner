public class UC5{
    public static void main(String[] args){
        String [] line = {
        (String.join(" " ,"   ***   ","   ***   ","******   ","  ***** ")),
        (String.join(" "," **   ** "," **   ** ","**    ** ","**       ")),
        (String.join(" ","**     **","**     **","**    ** "," **      ")),
        (String.join(" ","**     **","**     **","******   ","   ***   ")),
        (String.join(" ","**     **","**     **","**       ","      ** ")),
        (String.join(" "," **   ** "," **   ** ","**       ","**     **")),
        (String.join(" ","   ***   ","   ***   ","**       ","  *****  ")),
        }; 
        for(int i=0;i<7;i++){
            System.out.println(line[i]);
        }
    }
}