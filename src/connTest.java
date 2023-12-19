class connTest {
    private static connTest _inst = null;
    private int count = 0;
    public static connTest get(){
        if(_inst == null){
            _inst = new connTest();
            return _inst;
        }
        return _inst;
    }
    public void count(){count++;}
    public int getCount(){return count;}
}
