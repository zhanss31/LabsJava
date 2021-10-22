package lab1;

public class List {

        private Object[] data;

        public List(Object [] data)
        {
            this.data= data.clone();
        }

        public List ()
        {
            this.data=new Object[0];
        }

        public List (List ls) { this.data=ls.data.clone();}

        public void add (Object obj)
        {
            Object[] arr=new Object[this.data.length+1];
            for(int i=0; i<this.data.length; i++)
            {
                arr[i]=this.data[i];
            }
            arr[this.data.length]=obj;
            this.data=arr;
        }

        public void add( Object obj, int place)
        {
            if(place<0)
                place=0;
            if(place>this.data.length)
                place= this.data.length;

            Object[] data= new Object[this.data.length+1];
            for(int i=0; i<place; i++)
            {
                data[i]=this.data[i];
            }
            data[place]=obj;
            for(int i=place;i<this.data.length;i++)
            {
                data[i+1]=this.data[i];
            }
            this.data=data;
        }

        public Object get(int place)

        {
            if(place>this.data.length&& place<0)
                return 0;

            return this.data[place];
        }

        public Object remove ( int place)
        {
            if(place<0)
                place=0;
            if(place>this.data.length)
                place= this.data.length;
            Object data = this.data[place];
            Object[] arr=new Object[this.data.length-1];
            for(int i=0; i<place; i++)
            {
                arr[i]=this.data[i];
            }
            for(int i=place+1;i<this.data.length;i++)
            {
                arr[i-1]=this.data[i];
            }
            this.data=arr;
            return data;
        }

        public Object set( Object obj, int place)
        {
            if(place<0)
                place=0;
            if(place>this.data.length)
                place= this.data.length;

            Object data = this.data[place];
            Object[] arr=new Object[this.data.length];
            for(int i=0; i<place; i++)
            {
                arr[i]=this.data[i];
            }
            arr[place]=obj;
            for(int i=place+1;i<this.data.length;i++)
            {
                arr[i]=this.data[i];
            }
            this.data=arr;
            return data;
        }

        public boolean contains( Object obj)
        {
            for(int i=0;i<this.data.length;i++)
            {
                if(this.data[i]==obj)
                    return true;
            }
            return false;
        }

        public int indexОf( Object obj) {
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i].equals(obj))
                    return i;
            }
            return -1;
        }

        public int size ()
        {
            return this.data.length;
        }

        public boolean IsEmpty()
        {
            if( this.data.length==0)
                return true;

            return false;
        }


}
