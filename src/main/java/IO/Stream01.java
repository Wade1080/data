package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。

Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。

一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。

Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。

但本节讲述最基本的和流与 I/O 相关的功能。我们将通过一个个例子来学习这些功能。
 */
public class Stream01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，
        或者用 readLine() 方法读取一个字符串。
         */

    }
}
