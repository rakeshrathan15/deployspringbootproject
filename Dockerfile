FROM ubuntu:latest
LABEL authors="rakes"

ENTRYPOINT ["top", "-b"]