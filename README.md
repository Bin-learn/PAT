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

**test5[1016. 部分A+B ]:**
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

**test5(BigInteger)[A除以B]:**
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