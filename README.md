# springboot表单提交快捷提示
- javax.validation 提供 @NotNull @Size @Min等等注解对于数据注入实体进行控制
- 可以注入message来对于前端判断语句进行控制，在controller用@valid对注入实体进行控制拦截
- extends webMvcConfigurer被废弃，现在通过 implements WebMvcConfigurer来实现springmvc拦截
- addViewController 通过setViewName来把url“重命名” /results等价于results
- 在表单中指定实体的类型 th:object="${xxx}" 对表单进行控制
- 在具体表单选项中 th:field="*{xxx}"对于实体类具体属性进行分析 
- th:if="${#field.hasErrors('name')}" 判断输入name是否有错误 ,如果出错在controller通过BingingResult锁在这个页面 
- 此时 th:errors="*{name}" 触发提示信息
