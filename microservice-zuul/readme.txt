
1.通过网关访问服务提供
访问规则：127.0.0.1:9527/网关服务名称(小写)/服务提供者名称(小写)/服务路径
例如：http://127.0.0.1:9527/ZUUL-SERVER/TEST-PROVIDER/product/find/3
转换为小写: http://127.0.0.1:9527/zuul-server/test-provider/product/find/3
1) provider:
http://127.0.0.1:9527/zuul-server/test-provider/product/find/3
2) consumer:
http://127.0.0.1:9527/zuul-server/test-consumer/order/find/201810300001


2. 路径太长麻烦，不安全，在配置文件中继续配置
provider.path: /zuulproxy/**        #匹配指定的路径，资源匹配的路径才会拦截，转发

原来路径：http://127.0.0.1:9527/zuul-server/test-provider/product/find/3
网关访问路径变为： http://127.0.0.1:9527/zuulproxy/product/find/3


3. 屏蔽原来的网关地址访问资源
原来路径：http://127.0.0.1:9527/zuul-server/test-provider/product/find/3
网关访问路径变为： http://127.0.0.1:9527/zuulproxy/product/find/3

增加了如下两个配置：
  ignored-services: "*"                 #忽略直接使用服务名，*忽略所有服务
  prefix: /server                       #统一给访问前缀

网关访问路径变为： http://127.0.0.1:9527/server/zuulproxy/product/find/3