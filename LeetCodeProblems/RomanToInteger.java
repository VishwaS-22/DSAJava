package vishwa;

class RomanToInteger
{
    public int romanToInt(String s)
    {
        int a=0,n=0,p=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'M'->n=1000;
                case 'D'->n=500;
                case 'C'->n=100;
                case 'L'->n=50;
                case 'X'->n=10;
                case 'V'->n=5;
                case 'I'->n=1;
            }
            if(n<p)
            {
                a-=n;
            }
            else
            {
                a+=n;
            }
            p=n;
        }
        return a;
    }
}