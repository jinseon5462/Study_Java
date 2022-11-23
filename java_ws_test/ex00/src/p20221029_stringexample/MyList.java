package p20221029_stringexample;

public class MyList {
    String[] sArr = new String[5];
    String[] temp = new String[sArr.length + 5];
    int i = 0;


    public void add(String str){
        if(i < sArr.length){
            sArr[i] = str;
            i++;
        }else{
            for(int j = 0; j < sArr.length; j++){
                temp[j] = sArr[j];
            }
            temp[i] = str;
            i++;
            sArr = temp;
        }
    }
    public String get(int i){
        return sArr[i];
    }

    public int size(){
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == null){
                break;
            }
        }
        return i;
    }

    public void remove(int num){
        sArr[num] = sArr[num + 1];
        sArr[num + 1] = sArr[num + 2];
        sArr[num + 2] = null;
    }
}