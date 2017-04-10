# dockercomposeparser

This project provides an initial parser and printer for docker compose file v3. 

## How to use it?

```Java

// Parsing a docker compose file
Architecture a = new Parser().parse("docker-compose.yml");

// Saving an architecture to an outputStream	
new Printer().print(a,System.out);

```


