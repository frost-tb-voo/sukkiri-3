package sukkiri_3.ch15;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

import org.junit.Test;

public class Training15Test {
    @Test
    public void test01() {
        String s = "1";
        for (int ii=2;ii<=100;ii++) {
            s += "," + ii;
        }
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100", s);
        String[] a = s.split(",");
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]", Arrays.toString(a));
    }

    @Test
    public void test02() {
        assertEquals("/home/readme.txt", concat1("/home", "readme.txt"));
        assertEquals("/home/readme.txt", concat2("/home", "readme.txt"));
        assertEquals("/home/readme.txt", concat1("/home/", "readme.txt"));
        assertEquals("/home/readme.txt", concat2("/home/", "readme.txt"));
        assertEquals("/usr/lib/libau.so", concat1("/usr/lib", "libau.so"));
        assertEquals("/usr/lib/libau.so", concat2("/usr/lib", "libau.so"));
    }

    public String concat1(String folder, String file) {
        return new File(folder, file).getPath();
    }

    public String concat2(String folder, String file) {
        if (folder.endsWith(File.separator)) {
            return folder + file;
        }
        return folder + File.separator + file;
    }

    @Test
    public void test03() {
        Pattern regex1 = Pattern.compile(".*");
        Pattern regex2 = Pattern.compile("A[0-9][0-9]?");
        Pattern regex3 = Pattern.compile("U[A-Z][A-Z][A-Z]");
        
        assertEquals(true, regex1.matcher("input").matches());
        assertEquals(true, regex1.matcher("hoge").matches());

        assertEquals(true, regex2.matcher("A1").matches());
        assertEquals(true, regex2.matcher("A11").matches());
        assertEquals(false, regex2.matcher("A3G").matches());

        assertEquals(true, regex3.matcher("USAS").matches());
        assertEquals(false, regex3.matcher("USP").matches());
        assertEquals(false, regex3.matcher("UMP9").matches());
        assertEquals(false, regex3.matcher("Uzii").matches());
    }
    
}