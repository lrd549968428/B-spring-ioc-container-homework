有时候需要集成第三方应用时候要使用，或者是自己写的类时候要用， 如集成kerbos管理集群权限验证的时候，链接es需要用户名和密码，spring-data-elsticsearch原本提供的client端不支持用户名和密码的权限验证，这时需要自己重写client。