# Bootstrap

## Step 1 : initialize with springboot

```bash
curl https://start.spring.io/starter.tgz \
-d dependencies=lombok \
-d language=java \
-d type=maven-project \
-d baseDir=kata-bank-account-tdd \
-d groupId=com.newlight77 \ 
-d artifactId=kata-bank-account-tdd \
| tar -xzvf -
```

## Step 2 : add dependencies

```xml
		<dependency>
			<groupId>org.assertj</groupId>
			<artifactId>assertj-core</artifactId>
			<version>3.11.1</version>
			<scope>test</scope>
		</dependency>
```

## Step 3 : add build plugins

```xml
            <plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.3</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.7.0</version>
				<configuration>
					<encoding>UTF-8</encoding>
					<source>1.8</source>
					<target>1.8</target>
					<compilerArgument>-Werror</compilerArgument>
				</configuration>
			</plugin>
```
