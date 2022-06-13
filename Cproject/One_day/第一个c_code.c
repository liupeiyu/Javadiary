#include<stdio.h>
#include<stdlib.h>
//std = 标准 i input 输入，从键盘输入内容，output 输出，输出至显示屏 .h header 头

/*
编写人员：@peiyu
编写时间：28-04-2022
作者邮箱：lvegod@163.com
程序功能：第一个程序
*/

// 主函数，程序入口，有且仅有一个
int main()//int 返回值的类型（）代表参数列表

{


/*
\n 换行
\r 回到本行开头的位置  打印 aaa\rbbb试试
\t 水平制表位 tab
\\ 输出一个反斜杠
\' 输出一个'
\\" 输出\"
*/

printf("aaa\nbbb");
printf("aaa\tbbb");
printf("aaa\rbbb");
printf("aaa\\bbb");
printf("aaa\'bbb");
printf("aaa\\'bbb");
printf("hello\n");
return EXIT_SUCCESS;
}