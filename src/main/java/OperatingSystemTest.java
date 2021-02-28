import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class OperatingSystemTest {


    public static void main(String[] args) {

        OperatingSystemMXBean operatingSystemMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        java.lang.management.OperatingSystemMXBean operatingSystemMXBean2 = ManagementFactory.getOperatingSystemMXBean();

        System.out.println("getCpuProcessTime()" + " = " + operatingSystemMXBean.getProcessCpuTime());
        System.out.println("getSystemCpuLoad()" + " = " + operatingSystemMXBean.getSystemCpuLoad());
        System.out.println("getProcessCpuLoad()" + " = " + operatingSystemMXBean.getProcessCpuLoad());

        System.out.println("-------------------------------------------------");

        System.out.println("getSystemLoadAverage()" + " = " + operatingSystemMXBean2.getSystemLoadAverage());
        System.out.println("getAvailableProcessors()" + " = " + operatingSystemMXBean2.getAvailableProcessors());

    }

}
