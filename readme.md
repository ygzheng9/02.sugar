## 2020/03/01
1. use maven for speed 
    2. kotlin-compiler 
    3. jar: resource 目录下文件不打进 jar，而是 copy 到 config 目录下 
    4. assembly：最终输出 zip，目录结构定义好，对应的被打包文件，依赖度 jar
    
## 2020/03/03
1. 迁移旧程序
    1. mxstats
    2. order fulfilment
    
## 2020/03/15
1. 迁移 Order fulfilment
    1. 订单 - 配货 - 发货
    2. 出入库明细：补货入库，发货出库
    3. 现有库存状态查询：总在库量，已配货占用量，剩余可配货量
    4. 逆向操作；
2. http
    1. post 请求，附加 json 参数；
    2. 通过 rawData -> json parse -> java class 获取 post 来的 json 参数
3. 查询有限考虑返回 Record，除非有明确需求，再转换成 Typed Data Class；
    1. Record 可以和 sql 直接对相应；
    2. 只需要在 前端 做对 Record 做映射；
    3. 当 sql 修改时，只需要改前端，不需要改后端；    
    
## todo 
1. upload
2. action 中获取当前的 actionKey     


