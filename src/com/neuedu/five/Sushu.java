package com.neuedu.five;

public class Sushu {

    public static void main(String[] args)

    {
        //for循环遍历101-200

        for(int i = 101; i < 200; i++)

        {

            boolean b = false;

            //内层循环判断i是否为素数
            for(int j = 2; j <= i-1; j++)
            {

                //除了1和它本身以外，如果i可以整除其他数就b = false
                if( i % j == 0 )
                {
                    b = false;
                    break;
                }

                //如果不能整除就b = true
                else
                {
                    b = true;

                }
            }

            //如果b = true就打印出来
            if(b == true)
            { System.out.println(i);
                System.out.println("sushugeshuwei"+i);
            }
        }
    }
}

