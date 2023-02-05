class Print {
    public String delimeter = "";
    public Print(String delimeter){
        this.delimeter = delimeter; // this 붙이면 class에서 선언한 변수로 한정
    }
    public void A() {
        System.out.println(this.delimeter); // 이 경우 this 붙이는거 필수 x
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(this.delimeter); // 이 경우 this 붙이는거 필수 x
        System.out.println("B");
        System.out.println("B");
    }
}