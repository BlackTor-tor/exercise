package JavaBasics_High;

/**
 * @version 1.0
 * @Author tor
 * @Date 2023/9/8 12:36
 * @ע��
 */

public class testAnnotation {
    //@Deprecated��ʾ��ʱ��ע�⣬����汾����ʱ�ã���ͬһ�����е��ô��෽��ʱ����ʾɾ���ߣ������ڲ�ͬ���в�����ʾ
    @Deprecated
    public void haha() {
        System.out.println("��������");
    }
}
class father {
    //@SuppressWarning ע�⣬����ĳЩ��������ʾ�ľ�����Ϣ
    /**
     * @SuppressWarning �е����Խ����Լ�����˵��
     *
     * all���������о���
     * boxing���������װ/��װ��ҵ��صľ���
     * cast��������ǿ��ת����ҵ��صľ���
     * dep-ann����������̭ע����صľ���
     * deprecation����������̭����ؾ���
     * fallthrough��������switch����ʽ����©break��صľ���
     * finally��������δ����finally������صľ���
     * hiding�����������ر��������������صľ���
     * incomplete-switch��������switch����ʽ(enum case)����©��Ŀ��صľ���
     * javadoc��������javadoc��صľ���
     * nls���������nls�ִ�������صľ���
     * null���������ֵ������صľ���
     * rawtypes��������ʹ��raw������صľ���
     * resource��������ʹ��Closeable���͵���Դ��صľ���
     * restriction��������ʹ�ò�������ֹ������صľ���
     * serial������������л��������©serialVersionUID��λ��صľ���
     * static-access�������뾲̬��ȡ����ȷ��صľ���
     * static-method���������������Ϊstatic�ķ�����صľ���
     * super���������û�������ص�����super���еľ���
     * synthetic-access���������ڲ����Ĵ�ȡδ��ѻ���صľ���
     * sync-override��������Ϊ�û�ͬ����������©ͬ�����ľ���
     * unchecked��������δ������ҵ��صľ���
     * unqualified-field-access����������λ��ȡ���ϸ���صľ���
     * unused��������δ�õĳ�ʽ�뼰ͣ�õĳ�ʽ����صľ���
     */
    @SuppressWarnings("unused")
    public void run() {
//        new testAnnotation().haha();
        System.out.println("�ְ���");
    }
}
class son extends father{
    //@Overrideע�⣬���ڼ�������Ƿ���������д�˸��෽��������������ͨ����û������뱨��

    /**OverrideԴ�������
     * @Target(ElementType.METHOD)  //����λ�ã�����
     * @Retention(RetentionPolicy.SOURCE)   //������Դ����棬������ʹ�ú�ֱ�Ӷ������ֲ��Ե�ע�ͣ��������õ�class�ļ�
     * public @interface Override {
     * }
     */
    @Override
    public void run() {
        System.out.println("������");
    }
    /*@Override //��ʱ��������walk()��������ʹ����Overrideע�⣬������û��������������Ա���ᱨ��
    public void walk() {
    }
     */
}