FROM registry.saas.hand-china.com/hap-cloud/base:latest

COPY start.sh ./start.sh
COPY test4.jar  /test4.jar
RUN chmod a+x start.sh \
 & ls -al
CMD ["sh", "/start.sh"]