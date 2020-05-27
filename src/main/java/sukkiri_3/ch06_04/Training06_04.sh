
sudo -E apt-get update && sudo -E apt-get install -y tree

export CLASSPATH=./C_WORK_X64
cd ~/project
echo --> クラス群をパッケージ構成を崩さずそのまま CLASSPATH 配下へコピー
mkdir -p ${CLASSPATH} && cp -r ./target/classes/sukkiri_3 ${CLASSPATH}/
echo --> パッケージ構成を確認
tree ${CLASSPATH}/
ls -l ${CLASSPATH}/sukkiri_3/ch06_03/
ls -l ${CLASSPATH}/sukkiri_3/ch06_03/comment/

java sukkiri_3.ch06_03.Main

echo --> 後片付け（本来は不要）
rm -r ${CLASSPATH}
unset CLASSPATH
