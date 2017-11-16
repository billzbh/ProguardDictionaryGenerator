import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {



    private static final String ROOT_PATH = "/Users/zhangbiaohe/Downloads/ProguardDictionaryGenerator/src/";
    private static BufferedImage image;
    private static Graphics graphics;
    private static int width, height;
    private static int baseline;

    public static void main(String[] args) throws Exception {
        preparePaint();
        int start = 0x0100;
        int end = 0x1100;
        List<Holder> list = new ArrayList<>(end - start);
        for (int i = start; i < end; i++) {
            char c = (char) i;
            if (c < start || c >= end) {continue;}
            String s = String.valueOf(c);
            list.add(new Holder(s, getSizeForString(s)));
        }
        Collections.sort(list);

        File file = new File(ROOT_PATH, "dict.txt");
        FileOutputStream fos = new FileOutputStream(file);
        for (Holder holder : list) {
            fos.write(holder.character.getBytes("utf-8"));
//            fos.write(' ');
//            fos.write(String.valueOf(holder.complexity).getBytes("utf-8"));
            fos.write('\n');
        }
        fos.flush();
        fos.close();
//        fos = new FileOutputStream(new File(ROOT_PATH, "abc.png"));
//        graphics.drawString("龘", 0, baseline);
//        ImageIO.write(image, "png", fos);
//        fos.flush();
//        fos.close();


        //产生两种混淆字典
        String[] ldwStr = {"ആ","ഞ","ഌ","ൺ"};
        String[] kongStr = {"ඔ","൫","ම","இ"};
        String[] www = {"ԝ","ѡ","ധ","ω"};
        String[] ooo = {"օ","ಂ","o","०"};

        File file2 = new File(ROOT_PATH, "ldwDict.txt");
        FileOutputStream fos2 = new FileOutputStream(file2);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
//        int h=0;
        int Time = 4096;//最大不能超过16384，不然不能保证生成的字符串唯一。
        String strTo = null;
        for (int i = 0; i < Time; i++) {
            a = i%4;
            b = (i/4)%4;
            c = (i/16)%4;
            d = (i/64)%4;
            e = (i/256)%4;
            f = (i/1024)%4;
            g = (i/4096)%4;
//            h = (i/16384)%4;

//            strTo = ldwStr[a] + ldwStr[b] + ldwStr[c] + ldwStr[d] + ldwStr[e] + ldwStr[f] + ldwStr[g] + ldwStr[h];
            strTo = ldwStr[a] + ldwStr[b] + ldwStr[c] + ldwStr[d] + ldwStr[e] + ldwStr[f] + ldwStr[g];
            fos2.write(strTo.getBytes());
            fos2.write('\n');
        }
        fos2.flush();
        fos2.close();


        File file3 = new File(ROOT_PATH, "kongDict.txt");
        FileOutputStream fos3 = new FileOutputStream(file3);
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
//        h=0;
        Time = 4096;//最大不能超过16384，不然不能保证生成的字符串唯一。
        strTo = null;
        for (int i = 0; i < Time; i++) {
            a = i%4;
            b = (i/4)%4;
            c = (i/16)%4;
            d = (i/64)%4;
            e = (i/256)%4;
            f = (i/1024)%4;
            g = (i/4096)%4;
//            h = (i/16384)%4;

//            strTo = kongStr[a] + kongStr[b] + kongStr[c] + kongStr[d] + kongStr[e] + kongStr[f] + kongStr[g] + kongStr[h];
            strTo = kongStr[a] + kongStr[b] + kongStr[c] + kongStr[d] + kongStr[e] + kongStr[f] + kongStr[g];
            fos3.write(strTo.getBytes());
            fos3.write('\n');
        }
        fos3.flush();
        fos3.close();


        File file4 = new File(ROOT_PATH, "wwwDict.txt");
        FileOutputStream fos4 = new FileOutputStream(file4);
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
//        h=0;
        Time = 4096;//最大不能超过16384，不然不能保证生成的字符串唯一。
        strTo = null;
        for (int i = 0; i < Time; i++) {
            a = i%4;
            b = (i/4)%4;
            c = (i/16)%4;
            d = (i/64)%4;
            e = (i/256)%4;
            f = (i/1024)%4;
            g = (i/4096)%4;
//            h = (i/16384)%4;

//            strTo = kongStr[a] + kongStr[b] + kongStr[c] + kongStr[d] + kongStr[e] + kongStr[f] + kongStr[g] + kongStr[h];
            strTo = www[a] + www[b] + www[c] + www[d] + www[e] + www[f] + www[g];
            fos4.write(strTo.getBytes());
            fos4.write('\n');
        }
        fos4.flush();
        fos4.close();



        File file5 = new File(ROOT_PATH, "oooDict.txt");
        FileOutputStream fos5 = new FileOutputStream(file5);
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
//        h=0;
        Time = 4096;//最大不能超过16384，不然不能保证生成的字符串唯一。
        strTo = null;
        for (int i = 0; i < Time; i++) {
            a = i%4;
            b = (i/4)%4;
            c = (i/16)%4;
            d = (i/64)%4;
            e = (i/256)%4;
            f = (i/1024)%4;
            g = (i/4096)%4;
//            h = (i/16384)%4;

//            strTo = kongStr[a] + kongStr[b] + kongStr[c] + kongStr[d] + kongStr[e] + kongStr[f] + kongStr[g] + kongStr[h];
            strTo = ooo[a] + ooo[b] + ooo[c] + ooo[d] + ooo[e] + ooo[f] + ooo[g];
            fos5.write(strTo.getBytes());
            fos5.write('\n');
        }
        fos5.flush();
        fos5.close();
    }

    private static void getFonts() {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = environment.getAvailableFontFamilyNames();
        for (String font1 : fonts) {
            System.out.println(font1);
        }
    }

    private static void preparePaint() throws Exception {
        Font font = new Font("PingFang HK", Font.PLAIN, 200);

        image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);//test
        graphics = image.getGraphics();
        graphics.setFont(font);
        FontMetrics fontMetrics = graphics.getFontMetrics();

        width = fontMetrics.stringWidth("四");
        height = fontMetrics.getHeight();
        baseline = fontMetrics.getAscent();

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphics = image.getGraphics();
        graphics.setFont(font);

        System.out.println("width=" + width);
        System.out.println("height=" + height);
    }

    private static int getSizeForString(String str) throws Exception {
        graphics.clearRect(0, 0, width, height);
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.black);
        graphics.drawString(str, 0, baseline);
        //计算汉字所有像素的极惯性矩,用于比较
        int sum_x_2 = 0, sum_x = 0;
        int sum_y_2 = 0, sum_y = 0;
        int count = 0;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (isBlack(image.getRGB(w, h))) {
                    sum_x += w;
                    sum_x_2 += w * w;
                    sum_y += h;
                    sum_y_2 += h * h;
                    count++;
                }
            }
        }
        if (count == 0) return 0;
        return sum_x_2 - sum_x * sum_x / count + sum_y_2 - sum_y * sum_y / count;
    }

    private static boolean isBlack(int color) {
        Color c = new Color(color);
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return r * r + g * g + b * b < 127 * 127 * 3;
    }

    private static class Holder implements Comparable<Holder> {
        private String character;
        private int complexity;//字符复杂度

        Holder(String character, int complexity) {
            this.character = character;
            this.complexity = complexity;
        }

        @Override
        public int compareTo(Holder o) {
            return complexity - o.complexity;
        }

        @Override
        public String toString() {
            return character + " " + complexity;
        }
    }
}
