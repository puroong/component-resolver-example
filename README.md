# component-resolver-example

모바일 앱 서버 사이드 렌더링 API를 위한 예시 프로젝트입니다

## 용어

* Component
    * 앱에 렌더링할 컴포넌트입니다 (ex. 광고 컴포넌트, 동영상 컴포넌트 등등)
    * API응답은 각 컴포넌트를 렌더링하는데 필요한 데이터와 http 응답을 가지고 있습니다
    
* Resolver
    * 컴포넌트를 렌더링하는데 필요한 데이터를 가져오는 역할입니다
    
* Result
    * 컴포넌트를 렌더링할 하는데 필요한 데이터와 http 응답 정보를 가지고 있습니다
    
## 동작 방식

1. 모든 Resolver는 ComponentResolver라는 추상 클래스를 상속합니다 
   
    ComponentResolver는 resolve와 match라는 메소드를 가지고 있습니다
2. 컨트롤러에서 ComponentResolver 리스트를 주입받은 뒤, match 메소드로 실제 Resolver를 찾습니다

   찾지 못한다면 Result의 httpResponse로 http status code 500과 함께 Resolver가 없다는 메시지를 전달합니다 
3. 실제 Resolver의 resolve 메소드를 호출하여 Result를 조회합니다
4. 모든 Result를 API 응답으로 반환합니다

## 프로젝트 구조

```
src
  ㄴ main
    ㄴ kotlin
      ㄴ com.example.demo
        ㄴ component
            ㄴ resolver
              ㄴ ComponentResolver.kt
              ㄴ ForbiddenComponentResolver.kt
              ㄴ TextBannerComponentResolver.kt
            ㄴ response
              ㄴ ComponetResponse.kt
              ㄴ HttpResponse.kt
            ㄴ result
              ㄴ ComponentResult.kt
              ㄴ EmptyResult.kt
              ㄴ ForbiddenComponetResult.kt
              ㄴ TextBannerComponentResult.kt
      ㄴ model
        ㄴ ForbiddenModel.kt
        ㄴ TextBanner.kt
      ㄴ response
        ㄴ ScreenResponse.kt
      ㄴ vo
        ㄴ Version.kt
      ㄴ Controller.kt
      ㄴ DemoApplication.kt
      ...
```
## 결과 보기

DemoApplication.kt 실행한 뒤, http://localhost:8080/test 로 요청 보내면 샘플 응답을 확인할 수 있습니다
