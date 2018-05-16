
## requirements

* Typescript compiler - `npm install -g typescript`

## interactive
```
mvn archetype:generate \
-DarchetypeGroupId=org.bsc.processor \
-DarchetypeArtifactId=java2ts-processor-archetype \
-DarchetypeVersion=1.0-beta2
```


## run project


```
mvn clean package exec:exec@jjs
```
