# -*- coding: cp936 -*-
#�ڰ���----����0~9������任
#��cȤζ��̡�58-68��
#21:48 2006-11-4
from collections import deque
from math import log10
def permute(seq, index):
   seqc = seq[:]
   seqn = [seqc.pop()]
   divider = 2
   while seqc:
     index, new_index = divmod(index,divider)
     seqn.insert(new_index, seqc.pop())
     divider += 1
   return seqn
def z62():
    #0~7�˸����ŵ�������İ˸�������,ÿ������ĸ���֮�Ͷ����
    a=[0, 1, 2, 3, 4, 5, 6, 7]
    n=sum(a)
    if n%2==1:
        return
    else:
        n/=2
    for i in range(0,40320):
        v1=permute(a,i)
        if (v1[0] + v1[1] + v1[2] + v1[3] == n and
            v1[0] + v1[1] + v1[4] + v1[5]== n and
            v1[0] + v1[2] + v1[4] + v1[6] == n and
            v1[0] + v1[4] + v1[4]+ v1[7] == n and
            v1[0] + v1[1] > n / 2 and v1[5] > v1[7]):
            print v1
    return
def z58():
    #��������������������ָn*n��������ÿ��ÿ��1��n��Щ����,ֻ����һ��
    ss=6
    d = deque(range(1,ss+1))
    for i in range(ss):
        d.rotate(1)
        print list(d)
    return
def z59():
    '''����
    1 2 3
    4 5 6
    ����ÿһ���Ҵ�����
    ÿһ��  �´�����
    ����1~6    6������ '''
    t=range(2,6)
    for i in t:
        for j in t:
            for m in t:
                n=14-i-j-m
                if i!=j!=m!=i and j>i and n>m and n>i:
                    print [1,i,j]
                    print [m,n,6]
    return
def iss(n):
    s=''.join(map(str,n))
    t=set(s)
    m=len(s)
    return len(t)==m and '0' not in t
def z60():
    '''��192��384��576
    384���ڶ�����192�Ķ���
    576���ڶ�����192������
    ͬʱ��λ����1~9'''
    for i in range(111,333):
       t=[i,2*i,3*i]
       if iss(t):print t
def z61():
    #��361��529��784,������������ȫƽ��,��361=19*19ͬʱ��λ����1~9
    ge=[x*x for x in range(11,31)]
    for i in ge:
        for j in ge:
            for m in ge:
                t=[i,j,m]
                if i<j<m and iss(t):print t
def zz68(n):
    if n==2 :return filter(lambda x: x%2==0,range(11,99))
    t=[]
    p=zz68(n-1)
    for j in p:
        for i in range(10):
            nn=j*10+i
            if iss([nn]) and nn%n==0:
                t.append(nn)
    return t
def z66():
    '''��ʽ��ԭ
    ~          x7x
    ~  xx /--------
    ~    /   xxxxx
    ~        x77
    ~      ------
    ~         x7x
    ~         x7x
    ~         ----
    ~          xx
    ~          xx
    ~          ---
    ~           0
    '''
    for i in range(1,10):
        for j in range(11,100):
            m2 = i * j
            m3 = 7 * j
            if ((m2 % 100 == 77 and m2 >100) and (m3 / 10 % 10 == 7 and m3 > 100)):
                for k in range(1,10):
                    if k*j<100:
                        print [i*100+70+k,j]
    return
def z67():
    '''��ʽ��ԭ2
    ~            x7xxx
    ~  xxx /-----------
    ~     /   xxxxxxxx
    ~         xxxx
    ~        ------
    ~          xxx
    ~          xxx
    ~        -------
    ~           xxxx
    ~            xxx
    ~         ---------
    ~             xxxx
    ~             xxxx
    ~          ---------
    ~                0
    '''
    g=lambda x,y:map(lambda a,b=x:int(log10(a*b))+1,y)==[4,3,3,4]
    t=[8,9]
    for i in range(100,142):
        for j in t:
            for m in t:
                for n in t:
                    n1=j * 10000+7000+m * 100+n
                    e=[j,7,m,n]
                    if g(i,e) and (m * 100+n)*i/10000==10:
                        print n1,i,n1*i
    return
def z68():
    #������123456789���,����ǰ��λ��12 ���Ա�2 ����,123���Ա�3 ����,
    #ǰnλ���Ա�n ����,�����Ƕ���
    print zz68(9)
def z63():
    '''��ʽ��ԭ
    ~        PEAR
    -         ARA
    -----------------
    ~         PEA
    ���в�ͬ����ĸ����ͬ������'''
    t=range(0,10)
    for i in t:
        for j in t:
            for k in t:
                a,b,c= 100+k * 10+i,1000+k * 100+i * 10+j,i * 100+j * 10+i
                if a==b-c:
                    print [a,b,c]
def z64():
    '''��ʽ��ԭ
    ���� a����0~9ǰ�������
    z����0~9���������
    ~      AZA
     *     AAZ
    -----------------
    ~     AAAA
    ~    AAZZ
    ~    ZAA
    -----------------
    ~    ZAZAA'''
    g=lambda y:''.join(map(lambda x:x> '4' and '0' or '1' ,str(y)))
    t=range(1,5)
    m=range(5,10)
    t1=filter(lambda y:g(y)=='101',range(100,500))
    for i in t1:
        for j in filter(lambda y,x=i:g(y*x)=='011',t):
            for k in filter(lambda y,x=i:g(y*x)=="1100",t):
                for mm in filter(lambda y,x=i:g(y*x)=="1111",m):
                    jj =j *100+k *10+mm
                    if g(jj*i)=='01011':
                        print i,jj
                    
    return
def z65():
    ''' ��ʽ��ԭ2
    ~      PPP
     *      PP
    -----------
    ~     PPPP
    ~    PPPP
    -------------
    ~    PPPPP
    ����18��p��λ����ȫ������2��3��5��7'''
    def g(n):
        t=str(n)
        return len(filter(lambda x: int(x) in (2,3,5,7),t))==len(t)
    for i in range(222,778):
        for j in range(11,78):
            if g(i) and g(j) and g(i*j)  and g(j%10*i)and g(int(j/10)*i):
                print i,j,i*j
if __name__ == '__main__':
    s=""
    for i in range(58,69):
        s+='z'+str(i)+'()\n'
    exec(s)
