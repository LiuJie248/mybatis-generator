package liu;

import java.io.File;
import java.util.*;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author : LiuJie
 * @description : TODO
 * @date : 2022/11/10
 */
public class GeneratorFromXML {


        public static void main(String[] args) throws Exception {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("D:\\heXin\\generator\\src\\main\\resources\\generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("执行完成！！");
    }


}
