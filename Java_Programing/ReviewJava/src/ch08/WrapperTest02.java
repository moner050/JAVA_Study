package ch08;

public class WrapperTest02 {
    public static void main(String[] args) {
        // 8개의 Wrapper 클래스를 이용해 객체 생성해보기
        Object[] objectList = new Object[8];
        objectList[0] = Boolean.valueOf(false);
        objectList[1] = Character.valueOf('A');
        objectList[2] = Byte.valueOf((byte) 12);
        objectList[3] = Short.valueOf((short) 68);
        objectList[4] = Integer.valueOf(83);
        objectList[5] = Long.valueOf(12000000000L);
        objectList[6] = Float.valueOf(73.5F);
        objectList[7] = Double.valueOf(73.5);

        for (Object wrapper : objectList)
        {
            System.out.println(wrapper.toString());
        }
    }
}
