FROM ubuntu:15.04
RUN mkdir -p References
COPY README.md References
CMD ["echo", "File Copied Successfully"]
