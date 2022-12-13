对[SqlTemplate](https://github.com/wenzuojing/SqlTemplate)的改造，导入即用。

1. 导入到你的工程中

2. 依赖引入

   ```xml
   <dependency>
       <groupId>com.app</groupId>
       <artifactId>sqltemplate-spring-boot-starter</artifactId>
       <version>1.0-SNAPSHOT</version>
   </dependency>
   ```

3. 使用示例

   ```java
   String sql = "SELECT * FROM USER WHERE username = #{userName}";
   Bindings bind = new Bindings().bind("userName", "zs");
   SqlTemplateEngin sqlTemplateEngin = new SqlTemplateEngin();
   SqlTemplate sqlTemplate = sqlTemplateEngin.getSqlTemplate(sql);
   SqlMeta sqlMeta = sqlTemplate.process(bind);
   String sqlStr = sqlMeta.getSql();
   System.out.println(sqlStr);
   ```

   

