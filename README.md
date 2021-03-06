**sort:(常用排序算法)**
---

**test1:**
---
    题目描述

    给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。

    输入描述:

    输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。


    输出描述:

    对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。

    输入例子:
    4

    1 2 3

    2 3 4

    2147483647 0 2147483646

    0 -2147483648 -2147483647

    输出例子:

    Case #1: false

    Case #2: true

    Case #3: true

    Case #4: false
    

**test2:**
---
    题目描述
    给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
    
    
    
    A1 = 能被5整除的数字中所有偶数的和；
    
    A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
    
    A3 = 被5除后余2的数字的个数；
    
    A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
    
    A5 = 被5除后余4的数字中最大数字。
    
    输入描述:
    每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
    
    
    输出描述:
    对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
    
    若其中某一类数字不存在，则在相应位置输出“N”。
    
    输入例子:
    13 1 2 3 4 5 6 7 8 9 10 20 16 18
    
    输出例子:
    30 11 2 9.7 9

**test3(素数):**
---
    题目描述
    令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。
    
    输入描述:
    输入在一行中给出M和N，其间以空格分隔。
    
    
    输出描述:
    输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。
    
    输入例子:
    5 27
    
    输出例子:
    11 13 17 19 23 29 31 37 41 43
    
    47 53 59 61 67 71 73 79 83 89
    
    97 101 103
   
**test4(字符判断):**
---
    题目描述
    大侦探福尔摩斯接到一张奇怪的字条：“我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm”。大侦探很
    
     快就明白了，字条上奇怪的乱码实际上就是约会的时间“星期四 14:04”，因为前面两字符串中第1对相同的大写英文字母（大小写有区分）是
    
     第4个字母'D'，代表星期四；第2对相同的字符是'E'，那是第5个英文字母，代表一天里的第14个钟头（于是一天的0点到23点由数字0到9、
    
     以及大写字母A到N表示）；后面两字符串第1对相同的英文字母's'出现在第4个位置（从0开始计数）上，代表第4分钟。现给定两对字符串，
    
     请帮助福尔摩斯解码得到约会的时间。
    
    输入描述:
    输入在4行中分别给出4个非空、不包含空格、且长度不超过60的字符串。
    
    
    输出描述:
    在一行中输出约会的时间，格式为“DAY HH:MM”，其中“DAY”是某星期的3字符缩写，即MON表示星期一，TUE表示星期二，WED表示星期三，THU表示星期
    
    四，FRI表示星期五，SAT表示星期六，SUN表示星期日。题目输入保证每个测试存在唯一解。
    
    输入例子:
    3485djDkxh4hhGE
    
    2984akDfkkkkggEdsb
    
    s&hgsfdk
    
    d&Hyscvnm
    
    输出例子:
    THU 14:04

**test5(TreeSet)[德才论]:**
---
    题目描述
    宋代史学家司马光在《资治通鉴》中有一段著名的“德才论”：“是故才德全尽谓之圣人，才德兼亡谓之愚人，德胜才谓之君子，才胜德谓之
    
    小人。凡取人之术，苟不得圣人，君子而与之，与其得小人，不若得愚人。”
    
    
    
    现给出一批考生的德才分数，请根据司马光的理论给出录取排名。
    
    输入描述:
    输入第1行给出3个正整数，分别为：N（<=105），即考生总数；L（>=60），为录取最低分数线，即德分和才分均不低于L的考生才有资格
    
    被考虑录取；H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序；才分不到
    
    但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；德才分均低于H，但是德分不低于才分的考生属于“才德兼
    
    亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；其他达到最低线L的考生也按总分排序，但排在第三类考生之后。
    
    
    随后N行，每行给出一位考生的信息，包括：准考证号、德分、才分，其中准考证号为8位整数，德才分为区间[0, 100]内的整数。数字间以空格分隔。
    
    
    输出描述:
    输出第1行首先给出达到最低分数线的考生人数M，随后M行，每行按照输入格式输出一位考生的信息，考生按输入中说明的规则从高到低排序。当某类考生中有多人
    
    总分相同时，按其德分降序排列；若德分也并列，则按准考证号的升序输出。
    
    输入例子:
    14 60 80
    
    10000001 64 90
    
    10000002 90 60
    
    10000011 85 80
    
    10000003 85 80
    
    10000004 80 85
    
    10000005 82 77
    
    10000006 83 76
    
    10000007 90 78
    
    10000008 75 79
    
    10000009 59 90
    
    10000010 88 45
    
    10000012 80 100
    
    10000013 90 99
    
    10000014 66 60
    
    输出例子:
    12
    
    10000013 90 99
    
    10000012 80 100
    
    10000003 85 80
    
    10000011 85 80
    
    10000004 80 85
    
    10000007 90 78
    
    10000006 83 76
    
    10000005 82 77
    
    10000002 90 60
    
    10000014 66 60
    
    10000008 75 79
    
    10000001 64 90

**test6[1016. 部分A+B ]:**
---
    题目描述
    正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
     
     现给定A、DA、B、DB，请编写程序计算PA + PB。
    
    输入描述:
    输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 1010。
    
    
    输出描述:
    在一行中输出PA + PB的值。
    
    输入例子:
    3862767 6 13530293 3
    
    输出例子:
    399

**test7(BigInteger)[A除以B]:**
---
    题目描述
    本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。
    
    输入描述:
    输入在1行中依次给出A和B，中间以1空格分隔。
    
    
    输出描述:
    在1行中依次输出Q和R，中间以1空格分隔。
    
    输入例子:
    123456789050987654321 7
    
    输出例子:
    17636684150141093474 3
    
**test8(nextLine)[锤子剪刀布]:**
---
    题目描述
    大家应该都会玩“锤子剪刀布”的游戏：
    
    现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
    
    输入描述:
    输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代
    
    表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
    
    
    输出描述:
    输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。第3行给出两个字母，分别代表甲、乙获胜次数最多的手势，中间有1个空格。如果解不唯
    
    一，则输出按字母序最小的解。
    
    输入例子:
    10
    
    C J
    
    J B
    
    C B
    
    B B
    
    B C
    
    C C
    
    C B
    
    J B
    
    B C
    
    J J
    
    输出例子:
    5 3 2
    
    2 3 5
    
    B B
    
**test9(Arrays.sort)[ 数字黑洞]:**
---
    题目描述
    给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到
     一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
     
     例如，我们从6767开始，将得到
     
     7766 - 6677 = 1089
     9810 - 0189 = 9621
     9621 - 1269 = 8352
     8532 - 2358 = 6174
     7641 - 1467 = 6174
     ... ...
     
     现给定任意4位正整数，请编写程序演示到达黑洞的过程。
    
    输入描述:
    输入给出一个(0, 10000)区间内的正整数N。
    
    
    输出描述:
    如果N的4位数字全相等，则在一行内输出“N - N = 0000”；否则将计算的每一步在一行内输出，直到6174作为差出现，输出格式见样例,每行中间没有空行。注意每个数字按4位数格
     式输出。
    
    输入例子:
    6767
    
    输出例子:
    7766 - 6677 = 1089
     9810 - 0189 = 9621
     9621 - 1269 = 8352
     8532 - 2358 = 6174
     
**test10(DecimalFormat & sort)[月饼]:**
---
    题目描述
    月饼是中国人在中秋佳节时吃的一种传统食品，不同地区有许多不同风味的月饼。现给定所有种类月饼的库存量、总售价、以及市场的最大需
    
    求量，请你计算可以获得的最大收益是多少。
    
    
    
    注意：销售时允许取出一部分库存。样例给出的情形是这样的：假如我们有3种月饼，其库存量分别为18、15、10万吨，总售价分别为75、
    
    72、45亿元。如果市场的最大需求量只有20万吨，那么我们最大收益策略应该是卖出全部15万吨第2种月饼、以及5万吨第3种月饼，获得
    
     72 + 45/2 = 94.5（亿元）。
    
    输入描述:
    每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N表示月饼的种类数、以及不超过500（以万吨为单位）的正整数
    
    D表示市场最大需求量。随后一行给出N个正数表示每种月饼的库存量（以万吨为单位）；最后一行给出N个正数表示每种月饼的总售价（以亿
    
    元为单位）。数字间以空格分隔。
    
    
    输出描述:
    对每组测试用例，在一行中输出最大收益，以亿元为单位并精确到小数点后2位。
    
    输入例子:
    3 20
    
    18 15 10
    
    75 72 45
    
    输出例子:
    94.50
 
**test11(charAt)[个位数统计]:**
---
    题目描述
    给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
    
    输入描述:
    每个输入包含1个测试用例，即一个不超过1000位的正整数N。
    
    
    输出描述:
    对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。
    
    输入例子:
    100311
    
    输出例子:
    0:2
    
    1:3
    
    3:1
    
**test12(进制转换)[D进制的A+B]:**
---

    题目描述
    输入两个非负10进制整数A和B(<=230-1)，输出A+B的D (1 < D <= 10)进制数。
    
    输入描述:
    输入在一行中依次给出3个整数A、B和D。
    
    
    输出描述:
    输出A+B的D进制数。
    
    输入例子:
    123 456 8
    
    输出例子:
    1103
    
**test13[组个最小数]:**
---

    题目描述
    给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：
    
    给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
    
    
    
    现给定数字，请编写程序输出能够组成的最小的数。
    
    输入描述:
    每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空
    
    格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
    
    
    输出描述:
    在一行中输出能够组成的最小的数。
    
    输入例子:
    2 2 0 0 0 3 0 0 1 0
    
    输出例子:
    10015558

**test14(toPlainString())[科学计数法]:**
---

    题目描述
    科学计数法是科学家用来表示很大或很小的数字的一种方便的方法，其满足正则表达式[+-][1-9]"."[0-9]+E[+-][0-9]+，即数字的整数部分
    
    只有1位，小数部分至少有1位，该数字及其指数部分的正负号即使对正数也必定明确给出。
    
    
    
    现以科学计数法的格式给出实数A，请编写程序按普通数字表示法输出A，并保证所有有效位都被保留。
    
    输入描述:
    每个输入包含1个测试用例，即一个以科学计数法表示的实数A。该数字的存储长度不超过9999字节，且其指数的绝对值不超过9999。
    
    
    输出描述:
    对每个测试用例，在一行中按普通数字表示法输出A，并保证所有有效位都被保留，包括末尾的0。
    
    输入例子:
    +1.23400E-03
    
    输出例子:
    0.00123400
    
**test15()[打印沙漏]:**
---

    题目描述
    本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
     
     *****
      ***
       *
      ***
     *****
     所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递
     增；首尾符号数相等。
     
     给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
    
    输入描述:
    输入在一行给出1个正整数N（<=1000）和一个符号，中间以空格分隔。
    
    
    输出描述:
    首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。
    
    输入例子:
    19 *
    
    输出例子:
    *****
    
     ***
    
      *
    
     ***
    
    *****
    
    2
    
**test16(Comparable)[人口普查]:**
---
    题目描述
    某城镇进行人口普查，得到了全体居民的生日。现请你写个程序，找出镇上最年长和最年轻的人。
    
    
    
    这里确保每个输入的日期都是合法的，但不一定是合理的——假设已知镇上没有超过200岁的老人，而今天是2014年9月6日，所以超过200
    
    岁的生日和未出生的生日都是不合理的，应该被过滤掉。
    
    输入描述:
    输入在第一行给出正整数N，取值在(0, 105]；随后N行，每行给出1个人的姓名（由不超过5个英文字母组成的字符串）、以及
    
    按“yyyy/mm/dd”（即年/月/日）格式给出的生日。题目保证最年长和最年轻的人没有并列。
    
    
    输出描述:
    在一行中顺序输出有效生日的个数、最年长人和最年轻人的姓名，其间以空格分隔。
    
    输入例子:
    5
    
    John 2001/05/12
    
    Tom 1814/09/06
    
    Ann 2121/01/30
    
    James 1814/09/05
    
    Steve 1967/11/20
    
    输出例子:
    3 Tom John
    
**test17(contains, Character.toUpperCase)[旧键盘]:**
---
    题目描述
    旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
    
    肯定坏掉的那些键。
    
    输入描述:
    输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
    
    以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
    
    
    输出描述:
    按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
    
    输入例子:
    7_This_is_a_test
    
    _hs_s_a_es
    
    输出例子:
    7TI
    
**test18(Arrays.sort(a))[完美数列]:**
---
    题目描述
    给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。
    
    
    
    现在给定参数p和一些正整数，请你从中选择尽可能多的数构成一个完美数列。
    
    输入描述:
    输入第一行给出两个正整数N和p，其中N（<= 105）是输入的正整数的个数，p（<= 109）是给定的参数。第二行给出N个正整数，每个数
    
    不超过109。
    
    
    输出描述:
    在一行中输出最多可以选择多少个数可以用它们组成一个完美数列。
    
    输入例子:
    10 8
    
    2 3 20 4 5 1 6 7 8 9
    
    输出例子:
    8