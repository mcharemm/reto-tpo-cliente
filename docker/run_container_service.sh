#!/bin/bash

docker run --name service-clientes \
           -d \
           --restart unless-stopped \
           -p 8080:8080 \
           134219192027.dkr.ecr.us-east-1.amazonaws.com/reto-tpo/service-clientes
