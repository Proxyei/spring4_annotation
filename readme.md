# 说明
## 1, @ComponentScan与@Bean，要么两个都不写name/value，此时只返回一个bean，要么只写一边的name/value，此时返回两个bean，比如通过指定name方式获取相应的bean
## 2, // @ComponentScan(value = "com.xywei.spring4")、 @ComponentScan(basePackages = "com.xywei.spring4")等价
## 3,@ComponentScan(value = "com.xywei.spring4",includeFilters = {@filter(type="")})的时候，必须禁用默认filter ，也就是userDefaultFilter=false
## 4,@ComponentScan(value = "com.xywei.spring4",excludeFilters = {@filter(type="")})中不能使用userDefaultFilter
## 5,@import，添加任意一个component标记的组件进入spring容器