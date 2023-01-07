# Ejército del Perú - Centro de Infromática del Ejército

![GitHub repo size](https://img.shields.io/github/repo-size/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker)
![GitHub repo file count](https://img.shields.io/github/directory-file-count/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker)
![GitHub all releases](https://img.shields.io/github/downloads/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker/total)
[![GitHub contributors](https://img.shields.io/github/contributors/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker)](https://github.com/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker/graphs/contributors)
[![GitHub last commit](https://img.shields.io/github/last-commit/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker?logoColor=success)](https://github.com/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker/graphs/commit-activity)
![GitHub pull requests](https://img.shields.io/github/issues-pr/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker?color=red)
![GitHub language count](https://img.shields.io/github/languages/count/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker)
![GitHub followers](https://img.shields.io/github/followers/dbacilio88?style=social)
[![GitHub watchers](https://img.shields.io/github/watchers/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker?style=social)](https://github.com/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker/watchers)
[![**GitHub Repo stars
**](https://img.shields.io/github/stars/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker?style=social)](https://github.com/dbacilio88/lib-ep-cbd-microservices-utils-messaging-broker/stargazers)

## lib-ep-cbd-microservices-utils-messaging-broker

Libreria para microservicios con mensajeria de colas (AMQ) con Spring Boot.

* [Dependencias Externas](#external-dependencies)
* [Dependencias Internas](#internal-dependencies)

## <a name="external-dependencies"></a>Dependencias Externas

    <dependencies>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-autoconfigure</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${dependency-org.projectlombok-version}</version>
        </dependency>

        <dependency>
            <groupId>javax.json.bind</groupId>
            <artifactId>javax.json.bind-api</artifactId>
            <version>${dependency-javax.json.bind-version}</version>
        </dependency>

        <dependency>
            <groupId>com.google.code.findbugs</groupId>
            <artifactId>annotations</artifactId>
            <version>${dependency-com.google.code.findbugs-version}</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>com.google.code.findbugs</groupId>
            <artifactId>jsr305</artifactId>
            <version>${dependency-com.google.code.findbugs.jsr305-version}</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>${dependency-org.apache.logging.log4j-version}</version>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>${dependency-org.apache.logging.log4j.core-version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.mock-server</groupId>
            <artifactId>mockserver-junit-jupiter</artifactId>
            <version>${dependency-org.mock-server-version}</version>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>jakarta.validation</groupId>
                    <artifactId>jakarta.validation-api</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

    </dependencies>

## <a name="internal-dependencies"></a>Dependencias Internas

© 2023 Ejército del Perú. All rigths reserved