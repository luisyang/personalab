# -*- coding: cp936 -*-
#������----�߼��������ж�
#��cȤζ��̡�48-57��
#21:47 2006-11-4
def ntom(x,size,mod):
    t=[0]*(size)
    j=0
    while x and j<size:
        x,t[j]=divmod(x,mod)
        j+=1
    return t
def permute(seq, index):
   seqc = seq[:]
   seqn = [seqc.pop()]
   divider = 2
   while seqc:
     index, new_index = divmod(index,divider)
     seqn.insert(new_index, seqc.pop())
     divider += 1
   return seqn
def z48():
    '''�����������Ѿ�֪����������,����ȥ�����
    '''
    z=[[3,2,2],[2,2,2],[3,2,3]]
    t=juz(z)
    m=range(0,3)
    for i in m:
        for j in m:
            if t[i][j]==1:
                print chr(97+i),"��",chr(49+j),"���"
    return
def z49():
    ''' �����˰���������ѡȥ������������
a��b����ȥһ����   a+b>1
a��d����һ��ȥ   a+d!=2
a��e��f������Ҫȥ����  a+e+f==2
b��c��ȥ  ���� ����ȥ  (b+c==0 or b+c==2)
c��d������ֻȥһ��  c+d==1
���d��ȥ��eҲ��ȥ    (d+e==0 or d==1)'''
    ss=["��ȥ", "ȥ"]
    n=6
    for i in range(0,2**n+1):
        a,b,c,d,e,f=ntom(i,n,2)
        if a+b>1 and a+d!=2 and a+e+f==2 and (b+c==0 or b+c==2)\
        and c+d==1 and (d+e==0 or d==1):
            t=[a,b,c,d,e,f]
    for i in range(0,n):
        print chr(97+i),ss[t[i]]
    return
def z50():
    '''˭��˵��
a˵b��˵��(a and not b or not a and b)
b˵c��˵��(b and not c or not b and c)
c˵a��b����˵��(c and a+b==0 or  not c and a+b!=0)
������˭��˵�滰˭��˵��'''
    ss=["˵����", "��ʵ��"]
    n=3
    for i in range(0,2**n+1):
        a,b,c=ntom(i,n,2)
        if (a and not b or not a and b) and  (b and not c or not b and c)\
           and (c and a+b==0 or  not c and a+b!=0):
            t=[a,b,c]
    for i in range(0,n):
        print chr(97+i),ss[t[i]]
    return
def z51():
    '''�ĸ���������С͵���˱�ץ�ˣ�֪��������ֻ��һ��С͵ a+b+c+d=1
a˵ bû��͵  �� d͵��b+d=1 ��
b˵  bû��͵  �� c͵��b+c=1����
c˵ a û��͵  �� b͵��a+b=1
��֪ ����Ҫô˵�滰Ҫô˵�ٻ�,��˭͵��'''
    #��Ϊ��-�ڵõ�d+c=0����b=1��������b͵��
    print "b��С͵"
def z52():
    '''������
����ˣ�ñ�������ź������ı�ǩ���ڵ�˵�ѣ���ɫ��˵�滰����������˵��
a˵������3�����ı�ǩ�����������Լ���,��������滰��ô��a=1 ��b+c+d+e=3���������
�ٻ���ô��!a=1�� b+c+d+e!=3��Ҳ���� a&& b+c+d+e==3 || !a  && b+c+d+e!=3
b˵��0����c˵��1����d˵��4��'''
    ss=["��ɫ", "��ɫ"]
    n=5
    g=lambda w,ind,x:w[ind] and sum(w)-w[ind]==x or not w[ind] and\
          sum(w)-w[ind]!=x
    for i in range(0,2**n+1):
        t=ntom(i,n,2)
        if g(t,0,3) and g(t,1,0) and g(t,2,1) and g(t,3,4):
            tt=t
    for i in range(0,n):
        print chr(97+i),ss[tt[i]]
    return
def z53():
    #����Ҫô˵��Ҫô˵�滰,a˵��2����˵�滰��,b��c��˵ ��1��˵�滰��
    ss=["˵����", "��ʵ��"]
    n=3
    g=lambda w,ind,x:w[ind] and sum(w)==x or not w[ind] and sum(w)!=x
    for i in range(0,2**n+1):
        t=ntom(i,n,2)
        if g(t,0,2) and g(t,1,1) and g(t,2,1) :
            tt=t
    for i in range(0,n):
        print chr(97+i),ss[tt[i]]
    return
def z54():
    '''�����ˣ�һ��˵��0��һ��˵�滰2��һ����ȷ��1 ,a˵  b��2��
    (a==2==b or a!=2!=b)b˵ b��1��b!=2����Ϊ���b��2��ôb��˵b=2��c˵b��0 ��
    (c==0!=b or c==2 and b==0 or c==1)'''
    ss=["˵����", "������", "��ʵ��"]
    k=range(0,3)
    g=lambda m: reduce(lambda x,y:x*y, range(1, m+1))
    for i in range(1,g(3)):
        t=permute(k,i)
        a,b,c=t
        if (a==2==b or a!=2!=b) and b!=2 and (c==0!=b or c==2 and b==0 or c==1):
            tt=t
    for i in range(0,3):
        print chr(97+i),ss[tt[i]]
    return

def z55():
    #ֵ������a=c+1;d=e+2;g=b+3;f=4;����a~f��1~7��һ��һ�Ĺ�ϵ
    s11=["", "һ", "��", "��", "��", "��", "��", "��"]
    k=range(1,8)
    k.remove(4)
    g=lambda m: reduce(lambda x,y:x*y, range(1, m+1))
    for i in range(1,g(6)):
        t=permute(k,i)
        a,b,c,d,e,g=t
        f=4
        if (a == c + 1) and (d == e+2) and (g == b + 3) and(c<f<b or  c>f>b):
            tt=[a,b,c,d,e,f,g]
    for i in range(0,7):
        print chr(97+i),s11[tt[i]]
    return
def z56():
    #���ֹ���,�Ѿ�֪����������,����ȥ�����
    z=[[3,2,3,3,2,3],
[3,2,3,3,2,2],
[3,2,3,3,3,3],
[2,2,2,2,2,2],
[3,2,2,3,2,3],
[2,2,2,3,2,2]]
    ss=["��", "Ӣ", "��", "��", "��", "��"]
    t=juz(z)
    m=range(0,6)
    for i in m:
        for j in m:
            if t[j][i]==1:
                print chr(97+i),"����",ss[j]
def juz(z):
    n4=0
    while n4!=len(z):
        t=[]
        n4=0
        for ii in z:
            i=list(ii)
            n3=len(filter(lambda x:x==3,i))
            n1=len(filter(lambda x:x==1,i))
            if n3==len(z)-1:
                i=map(lambda x:x!=3 and 1 or x,i)
            if n1==1:
                n4+=1
                i=map(lambda x:x!=1 and 3 or x,i)
            t+=[i]
        z=t
        s1="zip("
        for j in range(0,len(z)):
            s1+="z["+str(j)+'],'
        s1=s1[:-1]+')'
        z=eval(s1)
        #print t,z
        # raw_input('ssss')
    return t
def z57():
    '''���ҾŸ����ӱ�������һ����9�֣���k����10-k��,�ܷ�Ϊ1+2+3+...+9=45,
    һ��Ϊ15�֣�����ÿһ��û�����������������ӵõ����������Σ���һ������ �ҵĺ���9��
    �ڶ��������ҵĺ��� 8�����һ����˭�ҵĺ��ӡ�
��Ϊ�����������Ե��������Լҵĺ���7�֡�������6��ֻ���� "��","��"�ҵġ�
ͬʱ��Ϊ15-1-7=7�������һ�������Լҵĺ��ӡ�
�����Ϊ15-6-9=0���� ���һ��������ҵĺ��ӡ�'''
    print "���һ�������ҵĺ���"
    return
if __name__ == '__main__':
    s=""
    for i in range(48,58):
        s+='z'+str(i)+'()\n'
    exec(s)
   
