FROM ubuntu:18.04

WORKDIR /app

COPY . /app

RUN apt-get update -y
RUN apt-get install -y python-pip python-dev build-essential
RUN pip install numpy

CMD ["python","main.py"]
