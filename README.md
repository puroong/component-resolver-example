# component-resolver-example

## 구조
```
src
  ㄴ main
    ㄴ ...
      ㄴ demo
        ㄴ component
          ㄴ resolver
            ㄴ ComponentResolver.kt
            ㄴ FailureComponentResolver.kt
            ㄴ HelloComponentResolver.kt
          ㄴ data
            ㄴ ComponentData.kt
            ㄴ EmptyData.kt
            ㄴ FailureComponentData.kt
            ㄴ HelloComponentData.kt
        ㄴ dto
          ㄴ FailureDto.kt
          ㄴ HelloDto.kt
          ㄴ ResolvedComponentInfo.kt
          ㄴ ResponseInfo.kt
        ㄴ response
          ㄴ ScreenResponse.kt
        ㄴ Config.kt // ComponentResolver 목록 Bean 생성하는데
        ㄴ Controller.kt
        ㄴ DemoApplication.kt
```

## 결과 보기

DemoApplication.kt 실행한 뒤, http://localhost:8080/test 로 요청 보내면 샘플 응답을 확인할 수 있습니다
