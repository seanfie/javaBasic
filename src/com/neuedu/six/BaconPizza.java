package com.neuedu.six;

    public class BaconPizza extends Pizza {
        private  int gramNum;

        public int getGramNum() {
            return gramNum;
        }

        public void setGramNum(int gramNum) {
            this.gramNum = gramNum;
        }
        public BaconPizza(){
            super();

        }
        public BaconPizza(int size,int price,String name,int gramNum ){
            super(size,price,name);
            this.gramNum=gramNum;
        }

        /*static int num;

         BaconPizza(){
             this.setName("培根披萨");
         }*/
        public String show(){
            return "名称："+super.getName()+"\n价格："+super.getPrice()+"元\n大小："
                    +super.getSize()+"寸"+"\n培根克数："+gramNum;
        }
    }

