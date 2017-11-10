//This library was not included in your upload
import edu.princeton.cs.introcs.*;

import java.awt.*;

public class SpotTheDifference {

    public static void main(String[] args){
        StdOut.println("Please insert picture one file path");
        String string1 = StdIn.readLine();
        StdOut.println("Please insert picture two file path");
        String string2 = StdIn.readLine();

        Picture pic1 = new Picture(string1.replace("\\","\\\\"));
        Picture pic2 = new Picture(string2.replace("\\","\\\\"));
        Picture pic3 = new Picture(pic1.width(),pic1.height());
        int i = 0;
        int j = 0;
        for (i = 0; i < pic1.width(); i++){
            for (j = 0; j < pic1.height(); j++){
                if (!pic1.get(i,j).equals(pic2.get(i,j))){

                    pic3.set(i,j, pic2.get(i,j));

                    System.out.println("["+ i+","+j+","+"("+pic1.get(i,j).getGreen()+", "+pic1.get(i,j).getRed()+", "+pic1.get(i,j).getBlue()+"), "+"("+pic2.get(i,j).getGreen()+", "+pic2.get(i,j).getRed()+", "+pic2.get(i,j).getBlue()+")]");

                }
            }
        }
        pic1.show();
        pic2.show();
        pic3.show();
    }
}
