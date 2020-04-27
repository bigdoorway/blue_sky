import com.byvoid.poo.PersonInfoList;
import org.junit.Test;

import java.io.File;
import java.io.PrintWriter;

public class DailyTest {
    @Test
    public void method() throws Exception{
        String result = "{'person_info':{'name':'tom', 'age':14, 'tel:':111111}}"; // 报文内容
        String fileName = "1.txt";
        File filePath = new File("D:" + fileName);// 指定文件输出目录
        // 判断指定目录下有没有重名文件
        if(!filePath.exists()) {
            filePath.createNewFile();
        } else {
            System.out.println("有重名文件！！！");
        }
        PrintWriter pfp= new PrintWriter(filePath);  // 字符输出流
        pfp.print(result);    // 输入报文
        pfp.close();   // 关闭输出流

    }
}
