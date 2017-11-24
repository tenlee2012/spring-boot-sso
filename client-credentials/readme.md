 - run `com.test.client.ClientCredentialsApp`
 - 获取token
```
curl -X POST \
  http://localhost:7788/oauth/token \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -H 'postman-token: c3f09c74-bb8c-4987-d9d8-06e367344fc5' \
  -F username=user \
  -F password=user \
  -F grant_type=password \
  -F scope=select \
  -F client_id=client_2 \
  -F client_secret=123456
```